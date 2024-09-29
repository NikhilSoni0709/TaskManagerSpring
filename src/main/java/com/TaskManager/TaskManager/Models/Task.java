package com.TaskManager.TaskManager.Models;

import com.TaskManager.TaskManager.DataClasses.TaskData;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column
    @JoinColumn(name = "handler_id")
    private Handler handler;

    @Column
    private String stage;

    @Column
    private String status;

    @Column
    private int priority;

    @Column
    private Timestamp time_assigned;

    @Column
    private Timestamp time_completed;

    @Column(name = "data")
    private TaskData data;

    public Task(int id, Customer customer, Handler handler, String stage, String status, int priority, Timestamp time_assigned, Timestamp time_completed, TaskData data) {
        this.id = id;
        this.customer = customer;
        this.handler = handler;
        this.stage = stage;
        this.status = status;
        this.priority = priority;
        this.time_assigned = time_assigned;
        this.time_completed = time_completed;
        this.data = data;
    }

    public Task(int id, Customer customer, Handler handler, int priority, TaskData data) {
        this.id = id;
        this.customer = customer;
        this.handler = handler;
        this.stage = ;
        this.priority = priority;
        this.data = data;
    }

    public TaskData getData() {
        return data;
    }

    public void setData(TaskData data) {
        this.data = data;
    }

    public Timestamp getTime_completed() {
        return time_completed;
    }

    public void setTime_completed(Timestamp time_completed) {
        this.time_completed = time_completed;
    }

    public Timestamp getTime_assigned() {
        return time_assigned;
    }

    public void setTime_assigned(Timestamp time_assigned) {
        this.time_assigned = time_assigned;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", customer=" + customer +
                ", handler=" + handler +
                ", stage='" + stage + '\'' +
                ", status='" + status + '\'' +
                ", priority=" + priority +
                ", time_assigned=" + time_assigned +
                ", time_completed=" + time_completed +
                ", data=" + data +
                '}';
    }
}
