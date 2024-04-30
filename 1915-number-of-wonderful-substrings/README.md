<h2><a href="https://leetcode.com/problems/number-of-wonderful-substrings/">1915. Number of Wonderful Substrings</a></h2><h3>Medium</h3><hr><div><p data-sider-select-id="f1896c7b-ddca-4d1d-a48a-f6d3de2d0b0e">A <strong data-sider-select-id="2362822e-22d3-4717-9d09-4595ef0f5552">wonderful</strong> string is a string where <strong>at most one</strong> letter appears an <strong>odd</strong> number of times.</p>

<ul>
	<li data-sider-select-id="178e6ece-4db6-4f3e-9e2c-946c4e6315ff">For example, <code data-sider-select-id="651ef454-188e-4bef-8b84-735e15e6e37a">"ccjjc"</code> and <code>"abab"</code> are wonderful, but <code data-sider-select-id="500dcc08-f8aa-4f39-ab87-ccef5719b9b5">"ab"</code> is not.</li>
</ul>

<p data-sider-select-id="68455979-5484-45d5-b443-91936df57d43">Given a string <code data-sider-select-id="8efea25d-2963-4db0-8176-98ffb8a59c31">word</code> that consists of the first ten lowercase English letters (<code>'a'</code> through <code>'j'</code>), return <em>the <strong data-sider-select-id="fd348786-9809-4ab1-8b6e-5fd2867889c8">number of wonderful non-empty substrings</strong> in </em><code>word</code><em data-sider-select-id="ad69fc23-ad28-4c3b-bd8d-6e930528629a">. If the same substring appears multiple times in </em><code>word</code><em>, then count <strong data-sider-select-id="349dd5c2-a72f-4e6b-90b9-3db0c95b2eee">each occurrence</strong> separately.</em></p>

<p data-sider-select-id="51776d85-db3c-496e-9d98-ebc689426cfc">A <strong>substring</strong> is a contiguous sequence of characters in a string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> word = "aba"
<strong>Output:</strong> 4
<strong>Explanation:</strong> The four wonderful substrings are underlined below:
- "<u><strong>a</strong></u>ba" -&gt; "a"
- "a<u><strong>b</strong></u>a" -&gt; "b"
- "ab<u><strong>a</strong></u>" -&gt; "a"
- "<u><strong>aba</strong></u>" -&gt; "aba"
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> word = "aabb"
<strong>Output:</strong> 9
<strong>Explanation:</strong> The nine wonderful substrings are underlined below:
- "<strong><u>a</u></strong>abb" -&gt; "a"
- "<u><strong>aa</strong></u>bb" -&gt; "aa"
- "<u><strong>aab</strong></u>b" -&gt; "aab"
- "<u><strong>aabb</strong></u>" -&gt; "aabb"
- "a<u><strong>a</strong></u>bb" -&gt; "a"
- "a<u><strong>abb</strong></u>" -&gt; "abb"
- "aa<u><strong>b</strong></u>b" -&gt; "b"
- "aa<u><strong>bb</strong></u>" -&gt; "bb"
- "aab<u><strong>b</strong></u>" -&gt; "b"
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> word = "he"
<strong>Output:</strong> 2
<strong>Explanation:</strong> The two wonderful substrings are underlined below:
- "<b><u>h</u></b>e" -&gt; "h"
- "h<strong><u>e</u></strong>" -&gt; "e"
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word.length &lt;= 10<sup>5</sup></code></li>
	<li><code>word</code> consists of lowercase English letters from <code>'a'</code>&nbsp;to <code>'j'</code>.</li>
</ul></div>