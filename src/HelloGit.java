public class HelloGit {

    Git git;
    public static void main(String[] args) {
        System.out.println("Hello Git!");
        System.out.println("Nice to me too!");
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
