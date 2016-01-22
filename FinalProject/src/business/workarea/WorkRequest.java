/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workarea;

import business.useraccount.UserAccount;
import java.util.Date;

/**
 *
 * @author pu
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String workRequestType;

    public enum StatusType {

        ApprovalRequest("Approval Request"),
        PendingApproval("Pending Approval"),
        Approved("Approved"),
        Reject("Rejected"),
        Placed("Placed"),
        Completed("Completed"),
        Scheduled("Scheduled");

        private String value;

        private StatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum WorkRequestType {

        NewEnterpriseWorkRequestType("New Enterprise Work Request"),
        NewDeviceOrderRequestType("New Device Order Request"),
        NewReservationWorkRequest("New Reservation Work Request"),
        NewSurgeryWorkRequest("New Surgery Work Request");

        private String value;

        private WorkRequestType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public WorkRequest(String workRequestType)
     {
         requestDate=new Date();
         this.workRequestType=workRequestType;         
     }
    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return message; //To change body of generated methods, choose Tools | Templates.
    }     

}
