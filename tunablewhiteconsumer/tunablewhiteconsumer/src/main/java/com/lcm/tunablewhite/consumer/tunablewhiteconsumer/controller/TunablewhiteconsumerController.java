package com.lcm.tunablewhite.consumer.tunablewhiteconsumer.controller;

import com.lcm.tunablewhite.consumer.tunablewhiteconsumer.model.DataProfile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/root")
public class TunablewhiteconsumerController {

    private static HashMap<String, DataProfile> profiles=new HashMap<>();


   // @PostMapping("/saveDataProfile")
    @RequestMapping(value={"","/page*","","view"})
    public ResponseEntity<DataProfile> consumeProfile(@RequestBody DataProfile dataProfile){

        profiles.put(dataProfile.getDataProfileIdentity(),dataProfile);

        System.out.println(dataProfile.toString()+"............dataProfile");

       return ResponseEntity.ok(dataProfile);

    }

    @GetMapping ("/getProfile/{dataProfileIdentity}")
    public ResponseEntity<DataProfile> sendProfile(@PathVariable String dataProfileIdentity){

        System.out.println(dataProfileIdentity.toString()+"............dataProfile");

        return ResponseEntity.ok(profiles.get(dataProfileIdentity));

    }
/*

    {
        "state": "DRAFT",
            "tags": [
        "demo-test-25"
    ],
        "dataDefinition": {
        "dataItems": [
        {
            "data": {
            "schedule": {
                "id": 1,
                        "action": {
                    "type": "Tunable White Setpoint",
                            "payload": {
                        "dim level": 254,
                                "lights_ct": 250,
                                "transition_time": 60
                    }
                },
                "recurrence": {
                    "time": {
                        "time": 1641027600000
                    },
                    "weekdays": [
                    "Sunday"
                            ]
                }
            }
        },
            "schemaIdentity": "device-management: distributed-scheduling-test7:1"
        }
        ]
    },
        "dataProfileIdentity": "device-management:aff9058c-c86d:1"
    }*/
}
