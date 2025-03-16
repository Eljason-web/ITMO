package enums;

public enum Moods {
    NONE{
        @Override
        public String toString(){
            return "undefined mood";
        }
    },
    EXCITED {
        @Override
        public String toString(){
            return "excited";
        }
    },
    CONFUSED {
        @Override
        public String toString(){
            return "confused";
        }
    },
    JOY {
        @Override
        public String toString(){
            return "joyfully";
        }
    }
}
