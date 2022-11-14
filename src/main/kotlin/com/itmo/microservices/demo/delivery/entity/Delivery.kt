package com.itmo.microservices.demo.delivery.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import ru.quipy.*

class Delivery {


    @Id
    @GeneratedValue
    var from: String? = null
    var to: String? = null
    var orderStatus: String? = null
    var orderName: String? = null
    var orderId: String? = null
    var userName: String? = null
    var userId: String? = null
    var courierName: String? = null
    var comment: String? = null

    constructor()

    constructor(from: String, to: String, orderStatus: String, orderName: String, orderId: String, userName: String, userId: String, courierName: String, comment: String) {
        this.from = from
        this.to = to
        this.orderId = orderId
        this.orderName = orderName
        this.orderStatus = orderStatus
        this.userName = userName
        this.userId = userId
        this.courierName = courierName
        this.comment = comment
    }
}