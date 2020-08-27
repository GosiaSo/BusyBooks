package pl.sobocinska.BusyBooks.task;

import pl.sobocinska.BusyBooks.clients.Client;
import pl.sobocinska.BusyBooks.statusTask.StatusTaskDictionary;
import pl.sobocinska.BusyBooks.taskDictionary.TasksDictionary;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private TasksDictionary task;
    @ManyToOne
    private StatusTaskDictionary status;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TasksDictionary getTask() {
        return task;
    }

    public void setTask(TasksDictionary task) {
        this.task = task;
    }

    public StatusTaskDictionary getStatus() {
        return status;
    }

    public void setStatus(StatusTaskDictionary status) {
        this.status = status;
    }
}
