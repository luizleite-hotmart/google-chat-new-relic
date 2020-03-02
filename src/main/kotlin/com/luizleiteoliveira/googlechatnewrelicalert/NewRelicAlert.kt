package com.luizleiteoliveira.googlechatnewrelicalert

data class NewRelicAlert(var eventType: String, var details: String, var conditionName: String, var severity: String,
                         var incidentUrl: String, var incidentId: String, var targets: MutableList<Target>, var callbackUrl: String) {

}
