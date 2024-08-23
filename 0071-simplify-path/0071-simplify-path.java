class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack=new Stack<>();
       String[] dir=path.split("/");
       for(String d:dir){
        if(d.equals(".") || d.isEmpty()){
            continue;
        }else if(d.equals("..")){
            if(!stack.isEmpty()){
                stack.pop();
            }
           } else{
                stack.push(d);
            }
        }
       return "/" +String.join("/",stack);
    }
}