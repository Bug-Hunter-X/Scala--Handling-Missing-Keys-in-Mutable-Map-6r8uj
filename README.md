# Scala: Handling Missing Keys in Mutable Map

This example showcases a potential issue when retrieving values from a mutable map in Scala. The `getValue` method returns 0 if the key is not present, which might lead to unexpected behavior or silent errors.

**The bug:**
The `getValue` method uses `getOrElse` with a default value of 0. This might mask errors if the absence of a key is a genuine issue. 

**The solution:**
The solution handles missing keys by either throwing an exception or returning an `Option`, which explicitly indicates the absence of a value.