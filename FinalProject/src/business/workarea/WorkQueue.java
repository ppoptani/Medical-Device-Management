/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workarea;

import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }
    
     public WorkRequest createWorkRequest(String workRequestType)
    {
        if(workRequestType.equalsIgnoreCase(WorkRequest.WorkRequestType.NewEnterpriseWorkRequestType.getValue()))
        {
            WorkRequest workRequest=new NewEnterpriseWorkRequest();
            workRequests.add(workRequest);
            return workRequest;
        }
        
         if(workRequestType.equalsIgnoreCase(WorkRequest.WorkRequestType.NewDeviceOrderRequestType.getValue()))
        {
            WorkRequest workRequest=new NewDeviceOrderRequest();
            workRequests.add(workRequest);
            return workRequest;
        }
         
           if(workRequestType.equalsIgnoreCase(WorkRequest.WorkRequestType.NewSurgeryWorkRequest.getValue()))
        {
            WorkRequest workRequest=new NewSurgeryWorkRequest();
            workRequests.add(workRequest);
            return workRequest;
        }
           
             if(workRequestType.equalsIgnoreCase(WorkRequest.WorkRequestType.NewReservationWorkRequest.getValue()))
        {
            WorkRequest workRequest=new NewReservationWorkRequest();
            workRequests.add(workRequest);
            return workRequest;
        }
       
        return null;
    }

}
