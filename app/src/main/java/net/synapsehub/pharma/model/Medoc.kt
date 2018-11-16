package net.synapsehub.pharma.model

class Medoc{
    //Les variables
    var id:Int=0
    var name:String=""
    var dateExp:String=""
    var dateFab:String=""
    var indication:String=""
    var price:Double=0.0
    var availability:String=""

    constructor(name:String, dateExp:String, dateFab:String, indication:String, price:Double, availability:String){
        this.name=name
        this.dateExp=dateExp
        this.dateFab=dateFab
        this.indication=indication
        this.price=price
        this.availability=availability
    }

}