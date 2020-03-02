package com.luizleiteoliveira.googlechatnewrelicalert

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.util.Arrays.asList

class NewRelicAlertTest {

    @Test
    fun `create new relic alert from scratch`() {
        val target = Target(id = "id", name = "name", link = "link")
        val alert = NewRelicAlert(eventType = "event_type",
                details = "details",
                conditionName = "condition_name",
                severity = "severity",
                incidentUrl = "incident_url",
                incidentId = "incident_id",
                targets = asList(target),
                callbackUrl = "https://webhook.site/ed449fc5-fa53-47d5-ae13-74f51ba4ea7f")

        assertEquals("details",  alert.details)
        assertEquals(1, alert.targets.size)
    }
}

