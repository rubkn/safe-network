package org.academiadecodigo.hackathon.womanizer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public ResponseEntity<API> api() {

        API api = new API();
        api.setName("Womanizer");
        api.setVersion("0.0.1");

        return new ResponseEntity<>(api, HttpStatus.OK);
    }

    private class API {

        private String name;
        private String version;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
