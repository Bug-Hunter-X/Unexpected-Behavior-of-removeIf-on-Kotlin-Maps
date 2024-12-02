# Kotlin removeIf Unexpected Behavior with Maps

This repository demonstrates an uncommon yet potentially problematic behavior when using the `removeIf` function on `MutableMap` in Kotlin. While `removeIf` functions predictably on `MutableList` and `MutableSet`, its behavior on `MutableMap` might not be immediately intuitive. This example highlights the difference and offers a solution.

## The Problem

The `removeIf` function removes elements from a collection based on a predicate.  With lists and sets, this is straightforward.  However, with maps, `removeIf` operates on the *key-value pair* (the `Map.Entry`), not just the keys.  This subtle difference can lead to errors if not carefully considered.

## How to Reproduce

Run `bug.kt`. Observe the unexpected results with map modification using `removeIf`.

## Solution

The solution provided in `bugSolution.kt` showcases a safer method for removing entries from a map based on a key condition.