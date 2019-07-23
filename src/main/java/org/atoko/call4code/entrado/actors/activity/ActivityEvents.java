package org.atoko.call4code.entrado.actors.activity;

import lombok.Data;

public class ActivityEvents {
    public interface Event {
    }


    @Data
    public static class ActivityCreatedEvent implements Event {
        String deviceId;
        String activityId;
        String name;

        public ActivityCreatedEvent(String deviceId, String activityId, String name) {
            this.deviceId = deviceId;
            this.activityId = activityId;
            this.name = name;
        }

        public ActivityCreatedEvent(ActivityCommands.ActivityCreateCommand command) {
            this.deviceId = command.deviceId;
            this.activityId = command.activityId;
            this.name = command.name;
        }
    }


    @Data
    public static class ActivityJoinedEvent implements Event {
        String activityId;
        String personId;

        public ActivityJoinedEvent(ActivityCommands.ActivityJoinCommand command) {
            this.activityId = command.activityId;
            this.personId = command.personId;
        }
    }
}
