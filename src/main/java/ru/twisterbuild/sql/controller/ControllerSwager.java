package ru.twisterbuild.sql.controller;

public class ControllerSwager {
    @RestController
    public class CustomController {

        @RequestMapping(value = "/custom", method = RequestMethod.POST)
        public String custom() {
            return "custom";
        }
    }
}
