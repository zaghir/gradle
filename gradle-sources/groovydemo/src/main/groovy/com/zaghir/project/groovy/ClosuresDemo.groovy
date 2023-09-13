package com.zaghir.project.groovy

c = {
    println("Closures are super simple")
}
// call an execute
c.call()

//  clusore with param
d = { n ->
    println(n % 2 == 0 ? "even" : "odd")
}
d.call(10)

//
4.times {
    n -> print n
}

4.times {
    println it  // it = iterator
}
