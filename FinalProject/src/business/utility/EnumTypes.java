/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.utility;

/**
 *
 * @author pu
 */
public class EnumTypes {
    
    public enum DeviceStatusType {
        
        Functional("Functional"),
        NonFunctional("Non-Functional");        

        private String value;

        private DeviceStatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum EmployeeType {
        
        Nurse("Nurse"),
        SubSpecialist("In Ware House"),
        Anesthesiologist("Anesthesiologist "),
        Surgeon("Surgeon");

        private String value;

        private EmployeeType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum RoomStatusType{
        Reserved("Reserved"),
        Available("Available");

        private String value;

        private RoomStatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum ReservationStatusType{
        Reserved("Reserved Device"),
        Completed("Completed Reservation Process");

        private String value;

        private ReservationStatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public enum MaintenanceStatusType{
        InFuture("In Future"),
        UnderMaintenance("Under Maintenance"),
        Completed("Completed");

        private String value;

        private MaintenanceStatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
}
