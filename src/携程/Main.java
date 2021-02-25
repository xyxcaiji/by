package 携程;

import com.sun.org.apache.regexp.internal.RE;

import java.security.PublicKey;
import java.util.*;
import java.util.prefs.NodeChangeEvent;
import java.util.stream.Collectors;



class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            WorkflowNode node = WorkflowNode.load(cin.next());
            System.out.println(maxTime(node));
        }

    }
    public static int maxTime(WorkflowNode root)
    {
        if(root==null||root.nextNodes==null) return -1;
        int max=0;
        List<WorkflowNode> nextNodes = root.nextNodes;
        int[] jihe=new int[nextNodes.size()];
        for(int i=0;i<jihe.length;i++)
        {
            jihe[i]=find(nextNodes.get(i));
        }
        Arrays.sort(jihe);
        //System.out.println(Arrays.toString(jihe));
        return jihe[jihe.length-1];
    }
    public static int find(WorkflowNode node)
    {
        if(node==null)
            return 0;
        int max=node.timeoutMillis;
        List<WorkflowNode> nextNodes = node.nextNodes;
        if(nextNodes==null)
            return max;
        int temp[]=new int[nextNodes.size()];
        for(int i=0;i<nextNodes.size();i++)
        {
            temp[i]= find(nextNodes.get(i));
        }
        Arrays.sort(temp);
        return max+temp[temp.length-1];
    }
    public static int getSize(WorkflowNode root)
    {
        if(root==null) return 0;
        int temp=root.nextNodes.size();
        for(int i=0;i<root.nextNodes.size();i++)
        {
           // temp+=getSize()
        }
        return 9;
    }
    static class WorkflowNode {
        String nodeId;
        int timeoutMillis;
        List<WorkflowNode> nextNodes;
        boolean initialised;

        public static WorkflowNode load(String value) {
            // Create head node;
            Map<String, WorkflowNode> map = new HashMap<>();
            WorkflowNode head = new WorkflowNode("HEAD", 0, null);
            map.put(head.nodeId, head);

            for (String nodeValue : value.split("\\|")) {
                String[] properties = nodeValue.split("\\`");
                WorkflowNode node = map.get(properties[0]);

                node.timeoutMillis = Integer.parseInt(properties[1]);
                node.initialised = true;

                // Check next nodes
                if (properties[2].equals("END")) {
                    continue;
                }
                node.nextNodes = Arrays.stream(properties[2].split(","))
                        .map(p -> new WorkflowNode(p, 0, null))
                        .collect(Collectors.toList());
                node.nextNodes.forEach(p -> map.put(p.nodeId, p));

                map.put(node.nodeId, node);
            }

            return head;
        }

        public WorkflowNode(String nodeId, int timeoutMillis, List<WorkflowNode> nextNodes) {
            this.nodeId = nodeId;
            this.timeoutMillis = timeoutMillis;
            this.nextNodes = nextNodes;
        }
    }
}