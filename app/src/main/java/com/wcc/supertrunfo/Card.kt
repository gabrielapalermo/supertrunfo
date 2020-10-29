package com.wcc.supertrunfo

class Card (
    val vehicle: Vehicle,
    var driver: Driver,
    val player: Player
){
    val label: String = "Card ${player.name}"
    val maxVelocity = setMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = setPassengers()

    private fun setPassengers(): Int{
        return vehicle.passengers*(1+driver.defensiveDriving)
    }
}
