public class HelloGit {

    Git git;
    public static void main(String[] args) {
        System.out.println("Hello Git!");
    }

    private class Git{
        private String name;
        private String time;
        public Git(String name ,String time){
            this.name=name;
            this.time=time;
        }
    }
}
