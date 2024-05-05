<h2><a href="https://leetcode.com/problems/minimum-rectangles-to-cover-points/">3111. Minimum Rectangles to Cover Points</a></h2><h3>Medium</h3><hr><div><p>You are given a 2D integer array <code>points</code>, where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code>. You are also given an integer <code>w</code>. Your task is to <strong>cover</strong> <strong>all</strong> the given points with rectangles.</p>

<p data-sider-select-id="d3cbcb39-3b15-42ed-a4b0-787629ce87ad">Each rectangle has its lower end at some point <code>(x<sub>1</sub>, 0)</code> and its upper end at some point <code>(x<sub>2</sub>, y<sub>2</sub>)</code>, where <code>x<sub>1</sub> &lt;= x<sub>2</sub></code>, <code>y<sub>2</sub> &gt;= 0</code>, and the condition <code>x<sub>2</sub> - x<sub>1</sub> &lt;= w</code> <strong>must</strong> be satisfied for each rectangle.</p>

<p data-sider-select-id="a8293e5f-1c06-466d-8229-2279ada3f3ad">A point is considered covered by a rectangle if it lies within or on the boundary of the rectangle.</p>

<p data-sider-select-id="b435a06d-60f9-4d20-a872-90006da8cb5f">Return an integer denoting the <strong data-sider-select-id="d8ff0670-e945-4fae-8cc7-3a2b60fa324b">minimum</strong> number of rectangles needed so that each point is covered by <strong>at least one</strong> rectangle<em>.</em></p>

<p data-sider-select-id="b0802631-0a88-452d-9d1c-a788ad47bc21"><strong data-sider-select-id="558ff591-5fd1-44a0-b35b-8fa3db3ddd6d">Note:</strong> A point may be covered by more than one rectangle.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/03/04/screenshot-from-2024-03-04-20-33-05.png" style="width: 205px; height: 300px;"></p>

<div class="example-block" style="border-color: var(--border-tertiary); border-left-width: 2px; color: var(--text-secondary); font-size: 0.875rem; margin-bottom: 1rem; margin-top: 1rem; overflow: visible; padding-left: 1rem; --darkreader-inline-color: var(--darkreader-text--text-secondary); --darkreader-inline-border: var(--darkreader-border--border-tertiary);" data-darkreader-inline-color="" data-darkreader-inline-border="">
<p><strong>Input:</strong> <span class="example-io" style="
    font-family: Menlo,sans-serif;
    font-size: 0.85rem;
">points = [[2,1],[1,0],[1,4],[1,8],[3,5],[4,6]], w = 1</span></p>

<p><strong>Output:</strong> <span class="example-io" style="
    font-family: Menlo,sans-serif;
    font-size: 0.85rem;
">2</span></p>

<p><strong>Explanation: </strong></p>

<p>The image above shows one possible placement of rectangles to cover the points:</p>

<ul>
	<li>A rectangle with a lower end at <code>(1, 0)</code> and its upper end at <code>(2, 8)</code></li>
	<li>A rectangle with a lower end at <code>(3, 0)</code> and its upper end at <code>(4, 8)</code></li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/03/04/screenshot-from-2024-03-04-18-59-12.png" style="width: 260px; height: 250px;"></p>

<div class="example-block" style="border-color: var(--border-tertiary); border-left-width: 2px; color: var(--text-secondary); font-size: 0.875rem; margin-bottom: 1rem; margin-top: 1rem; overflow: visible; padding-left: 1rem; --darkreader-inline-color: var(--darkreader-text--text-secondary); --darkreader-inline-border: var(--darkreader-border--border-tertiary);" data-darkreader-inline-color="" data-darkreader-inline-border="">
<p><strong>Input:</strong> <span class="example-io" style="
    font-family: Menlo,sans-serif;
    font-size: 0.85rem;
">points = [[0,0],[1,1],[2,2],[3,3],[4,4],[5,5],[6,6]], w = 2</span></p>

<p><strong>Output:</strong> <span class="example-io" style="
    font-family: Menlo,sans-serif;
    font-size: 0.85rem;
">3</span></p>

<p><strong>Explanation: </strong></p>

<p>The image above shows one possible placement of rectangles to cover the points:</p>

<ul>
	<li>A rectangle with a lower end at <code>(0, 0)</code> and its upper end at <code>(2, 2)</code></li>
	<li>A rectangle with a lower end at <code>(3, 0)</code> and its upper end at <code>(5, 5)</code></li>
	<li>A rectangle with a lower end at <code>(6, 0)</code> and its upper end at <code>(6, 6)</code></li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/03/04/screenshot-from-2024-03-04-20-24-03.png" style="height: 150px; width: 127px;"></p>

<div class="example-block" style="border-color: var(--border-tertiary); border-left-width: 2px; color: var(--text-secondary); font-size: 0.875rem; margin-bottom: 1rem; margin-top: 1rem; overflow: visible; padding-left: 1rem; --darkreader-inline-color: var(--darkreader-text--text-secondary); --darkreader-inline-border: var(--darkreader-border--border-tertiary);" data-darkreader-inline-color="" data-darkreader-inline-border="">
<p><strong data-sider-select-id="33ab1855-c4a2-4afa-b286-a909f27815a8">Input:</strong> <span class="example-io" style="
    font-family: Menlo,sans-serif;
    font-size: 0.85rem;
">points = [[2,3],[1,2]], w = 0</span></p>

<p><strong>Output:</strong> <span class="example-io" style="
    font-family: Menlo,sans-serif;
    font-size: 0.85rem;
">2</span></p>

<p><strong>Explanation: </strong></p>

<p>The image above shows one possible placement of rectangles to cover the points:</p>

<ul>
	<li>A rectangle with a lower end at <code>(1, 0)</code> and its upper end at <code>(1, 2)</code></li>
	<li>A rectangle with a lower end at <code>(2, 0)</code> and its upper end at <code>(2, 3)</code></li>
</ul>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= points.length &lt;= 10<sup>5</sup></code></li>
	<li><code>points[i].length == 2</code></li>
	<li><code>0 &lt;= x<sub>i</sub> == points[i][0] &lt;= 10<sup>9</sup></code></li>
	<li><code>0 &lt;= y<sub>i</sub> == points[i][1] &lt;= 10<sup>9</sup></code></li>
	<li><code>0 &lt;= w &lt;= 10<sup>9</sup></code></li>
	<li>All pairs <code>(x<sub>i</sub>, y<sub>i</sub>)</code> are distinct.</li>
</ul>
</div>