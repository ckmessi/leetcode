### 162. Find Peak Element

A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.

click to show spoilers.

Note:
Your solution should be in logarithmic complexity.

* * *

找出一个数组中的peak元素。   
这道题目在暑期实习微软面试中被卡了好久好久。   
首先我们有一个假设，left和right中间存在元素。如果不存在了，取left和right较大的那个即可。因此循环结束条件是left < right - 1。然后取mid，如果nums[mid] < nums[mid+1]，则取left=mid+1维持原有不变量；否则取right=mid保持。

这样最后退出时，选择left和right较大的元素即是peak元素。  

