package leetcode

import java.util.TreeSet
import kotlin.math.abs

object ContainingDuplicatesSolution {

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false

        val sortedArray = nums.sortedArray()
        var duplicateElement = sortedArray[0]

        for (index in 1 until sortedArray.size) {
            if (duplicateElement == sortedArray[index])
                return true
            else
                duplicateElement = sortedArray[index]
        }

        return false
    }

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int, Int>()

        for (n in nums.indices) {
            if (!map.containsKey(nums[n])) {
                map[nums[n]] = n
            } else {
                val currentIndex = map.get(nums[n])!!
                if (abs(currentIndex - n) <= k) {
                    return true
                } else
                    map[nums[n]] = n
            }
        }

        return false
    }

    fun containsNearbyAlmostDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        val treeSet = TreeSet<Long>()

        for (index in nums.indices) {
            treeSet.floor(nums[index].toLong())?.let { if (abs(it - nums[index]) <= t) return true }
            treeSet.ceiling(nums[index].toLong())?.let { if (abs(it - nums[index]) <= t) return true }

            if (treeSet.size > k)
                treeSet.remove(nums[index - k].toLong())
            else
                treeSet.add(nums[index].toLong())
        }

        return false
    }
}