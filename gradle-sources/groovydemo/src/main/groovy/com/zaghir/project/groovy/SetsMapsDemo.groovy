package com.zaghir.project.groovy
//----------------Set
s = ['java' ,'rust' , 'groovy' , 'typescript', 'python' ,'python'] as Set
// size = 5 != 6  , not accept duplicate value python
println s.size()
println s
println s.class

//----------------TreeSet
ts = ['java' ,'rust' , 'groovy' , 'typescript', 'python' ,'python'] as Set
// size = 5 != 6  , not accept duplicate value python
println ts.size()
println ts
println ts.class

//----------------Map
m = [:]
println m

n = [couseName : 'Gradle' , racing: 5 , price: 20]
println n
n.each { k,v ->
    println(" key: ${k} , value : ${v} " )
}

println n.couseName
println n['couseName']
println n.get('couseName')

n.review = 'Its great'
println n.get('review')

n['review'] = 'Its great 2'






