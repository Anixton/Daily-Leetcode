<h2><a href="https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/">2535. Difference Between Element Sum and Digit Sum of an Array</a></h2><h3>Easy</h3><hr><div><p>You are given a positive integer array <code>nums</code>.</p>

<ul>
	<li>The <strong>element sum</strong> is the sum of all the elements in <code>nums</code>.</li>
	<li>The <strong>digit sum</strong> is the sum of all the digits (not necessarily distinct) that appear in <code>nums</code>.</li>
</ul>

<p>Return <em>the <strong>absolute</strong> difference between the <strong>element sum</strong> and <strong>digit sum</strong> of </em><code>nums</code>.</p>

<p><strong>Note</strong> that the absolute difference between two integers <code>x</code> and <code>y</code> is defined as <code>|x - y|</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre data-sider-select-id="aac248d6-9fe1-4f51-b88d-1bd9ade8c8ed"><strong data-sider-select-id="25b993ee-c695-45a2-9b65-f1aa84c09921">Input:</strong> nums = [1,15,6,3]
<strong data-sider-select-id="d0e77dd4-a8c7-4537-9c8b-93bda3149377">Output:</strong> 9
<strong>Explanation:</strong> 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre data-sider-select-id="79e07d46-42f8-4e8e-b0c8-41a214cb55bd"><strong data-sider-select-id="c213b2a8-1d91-48a7-9eea-2b04673b3bbe">Input:</strong> nums = [1,2,3,4]
<strong data-sider-select-id="ee914b0b-c500-425a-9322-21a293c529c9">Output:</strong> 0
<strong data-sider-select-id="9d2b3783-db30-4610-afe7-41e7fbe5e989">Explanation:</strong>
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2000</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 2000</code></li>
</ul>
</div>