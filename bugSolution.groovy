```groovy
def myMethod(List<String> list) {
  if (list == null) {
    println "Input list is null"
    return
  }
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
  }
}

myMethod(null)
myMethod(['apple', 'banana', 'cherry'])
```