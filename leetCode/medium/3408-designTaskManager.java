public import java.util.*;

class TaskManager {

    static class Task{
        int userId, taskId, priority;
        Task(int u, int t, int p){
            userId = u;
            taskId = t;
            priority = p;
        }
    }

    // Map taskId -> userId, priority
    private Map<Integer, Task> taskMap = new HashMap<>();

    // Max-heap ordered by(priority, taskId);
    private PriorityQueue<Task> pq = new PriorityQueue<>(
        (a, b) -> {
            if(b.priority != a.priority) return Integer.compare(b.priority, a.priority);
            return Integer.compare(b.taskId, a.taskId);
        }
    );

    public TaskManager(List<List<Integer>> tasks) {
        for(List<Integer> element : tasks){
            int userId = element.get(0);
            int taskId = element.get(1);
            int priority = element.get(2);
            Task task = new Task(userId, taskId, priority);
            taskMap.put(taskId, task);
            pq.add(task); 
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        taskMap.put(taskId, task);
        pq.add(task);
    }
    
    public void edit(int taskId, int newPriority) {
        Task old = taskMap.get(taskId);
        if(old == null) return;
        Task updated = new Task(old.userId, taskId, newPriority);
        taskMap.put(taskId, updated);
        pq.add(updated);
    }
    
    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }
    
    public int execTop() {
        while(!pq.isEmpty()){
            Task top = pq.peek();
            Task current = taskMap.get(top.taskId);
            if(current == null || current.priority != top.priority || current.userId != top.userId){
                pq.poll();
                continue;
            }

            pq.poll();
            taskMap.remove(top.taskId);
            return top.userId;
        }
        return -1;
        
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */ 3408-designTaskManager {
  
}
