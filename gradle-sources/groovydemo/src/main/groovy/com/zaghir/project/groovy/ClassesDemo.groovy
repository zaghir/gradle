package com.zaghir.project.groovy


class Patient {
    def firstName , lastName , age
    static hospitalCode = "Best Hospital"

    void setLastName(lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Last name can not be null ")
        }
        this .lastName = lastName
    }
    static void display(){
        println hospitalCode
    }
}

p = new Patient(firstName: "zaghir", lastName: "you" , age: 40)
p.setLastName("p")
println( p.firstName + p.lastName + p.age)

Patient.display()



