package net.synapsehub.pharma.model

class Pharmacie{
    //variable
    var id:Int=0
    var name:String=""
    var adresse:String=""
    var description:String=""
    var proprietaire:String=""
    var openHour:String=""
    var closingHour:String=""
    var latitude:Double=0.0
    var longitude:Double=0.0

    constructor(name:String,adresse:String,description:String,proprietaire:String,openHour:String,closingHour:String,latitude:Double,longitude:Double){
        this.name=name
        this.adresse=adresse
        this.description=description
        this.proprietaire=proprietaire
        this.openHour=openHour
        this.closingHour=closingHour
        this.latitude=latitude
        this.longitude=longitude
    }


}