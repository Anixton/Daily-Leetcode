<h2><a href="https://leetcode.com/problems/largest-local-values-in-a-matrix/">2373. Largest Local Values in a Matrix</a></h2><h3>Easy</h3><hr><div><p>You are given an <code>n x n</code> integer matrix <code>grid</code>.</p>

<p>Generate an integer matrix <code>maxLocal</code> of size <code>(n - 2) x (n - 2)</code> such that:</p>

<ul>
	<li><code>maxLocal[i][j]</code> is equal to the <strong>largest</strong> value of the <code>3 x 3</code> matrix in <code>grid</code> centered around row <code>i + 1</code> and column <code>j + 1</code>.</li>
</ul>

<p>In other words, we want to find the largest value in every contiguous <code>3 x 3</code> matrix in <code>grid</code>.</p>

<p>Return <em>the generated matrix</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/06/21/ex1.png" style="width: 371px; height: 210px;">
<pre data-sider-select-id="9ede8d8a-8ef7-4c64-8098-3d33772ae870"><strong data-sider-select-id="1667b78e-58da-407f-a223-0d2995d43373">Input:</strong> grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]
<strong data-sider-select-id="a13ba0f2-ec29-4b1e-900e-0b59e9c2a007">Output:</strong> [[9,9],[8,6]]
<strong data-sider-select-id="e0ae3ada-de34-4d94-b215-71989c8fd94a">Explanation:</strong> The diagram above shows the original matrix and the generated matrix.
Notice that each value in the generated matrix corresponds to the largest value of a contiguous 3 x 3 matrix in grid.</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2022/07/02/ex2new2.png" style="width: 436px; height: 240px;">
<pre><strong>Input:</strong> grid = [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]
<strong>Output:</strong> [[2,2,2],[2,2,2],[2,2,2]]
<strong>Explanation:</strong> Notice that the 2 is contained within every contiguous 3 x 3 matrix in grid.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == grid.length == grid[i].length</code></li>
	<li><code>3 &lt;= n &lt;= 100</code></li>
	<li><code>1 &lt;= grid[i][j] &lt;= 100</code></li>
</ul>
</div>