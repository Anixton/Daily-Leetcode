<h2><a href="https://leetcode.com/problems/longest-turbulent-subarray/">978. Longest Turbulent Subarray</a></h2><h3>Medium</h3><hr><div><p>Given an integer array <code>arr</code>, return <em>the length of a maximum size turbulent subarray of</em> <code>arr</code>.</p>

<p data-sider-select-id="35145c4f-0466-4c84-a7b8-946bcba127a5">A subarray is <strong>turbulent</strong> if the comparison sign flips between each adjacent pair of elements in the subarray.</p>

<p data-sider-select-id="7368469a-3673-450a-b6f3-ae7948e83589">More formally, a subarray <code>[arr[i], arr[i + 1], ..., arr[j]]</code> of <code>arr</code> is said to be turbulent if and only if:</p>

<ul>
	<li data-sider-select-id="96b7edd3-7cdb-41bc-a371-2a95882f3ee3">For <code>i &lt;= k &lt; j</code>:

	<ul>
		<li><code>arr[k] &gt; arr[k + 1]</code> when <code>k</code> is odd, and</li>
		<li><code>arr[k] &lt; arr[k + 1]</code> when <code>k</code> is even.</li>
	</ul>
	</li>
	<li data-sider-select-id="7d4f81c1-7457-4e3d-85be-bbe3495ca61d">Or, for <code>i &lt;= k &lt; j</code>:
	<ul>
		<li><code>arr[k] &gt; arr[k + 1]</code> when <code>k</code> is even, and</li>
		<li><code>arr[k] &lt; arr[k + 1]</code> when <code>k</code> is odd.</li>
	</ul>
	</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre data-sider-select-id="5fcdb0f9-d0a7-4652-bc0d-92604904a45c"><strong>Input:</strong> arr = [9,4,2,10,7,8,8,1,9]
<strong>Output:</strong> 5
<strong>Explanation:</strong> arr[1] &gt; arr[2] &lt; arr[3] &gt; arr[4] &lt; arr[5]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre data-sider-select-id="746734ea-31f8-4e02-a961-869da1496026"><strong>Input:</strong> arr = [4,8,12,16]
<strong>Output:</strong> 2
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> arr = [100]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= arr.length &lt;= 4 * 10<sup>4</sup></code></li>
	<li><code>0 &lt;= arr[i] &lt;= 10<sup>9</sup></code></li>
</ul>
</div>