<h2><a href="https://leetcode.com/problems/is-object-empty/">2727. Is Object Empty</a></h2><h3>Easy</h3><hr><div><p data-sider-select-id="323b0d62-ce10-454e-9f77-57bff04666c7">Given an object or an array, return if it is empty.</p>

<ul>
	<li>An empty object contains no key-value pairs.</li>
	<li>An empty array contains no elements.</li>
</ul>

<p>You may assume the object or array is the output of&nbsp;<code>JSON.parse</code>.</p>

<p data-sider-select-id="22984381-77b5-45dd-abd4-5a9a395bdfd2">&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre data-sider-select-id="9c45e048-48af-4532-bc20-98a88aae5b1e"><strong>Input:</strong> obj = {"x": 5, "y": 42}
<strong>Output:</strong> false
<strong>Explanation:</strong> The object has 2 key-value pairs so it is not empty.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre data-sider-select-id="c0d6a6f2-49fb-443a-a634-903474c3fb11"><strong>Input:</strong> obj = {}
<strong>Output:</strong> true
<strong>Explanation:</strong> The object doesn't have any key-value pairs so it is empty.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre data-sider-select-id="a3d9a7ea-b10d-4b96-ae88-d029863254b6"><strong>Input:</strong> obj = [null, false, 0]
<strong>Output:</strong> false
<strong>Explanation:</strong> The array has 3 elements so it is not empty.
</pre>

<p>&nbsp;</p>
<p><strong data-sider-select-id="417c62d9-ff0b-4b8f-869c-cde2798aeabc">Constraints:</strong></p>

<ul>
	<li><code data-sider-select-id="063adca3-dff4-4fab-bc29-29178951227c">obj</code> is a valid JSON object or array</li>
	<li><code>2 &lt;= JSON.stringify(obj).length &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>
<strong>Can you solve it in O(1) time?</strong></div>