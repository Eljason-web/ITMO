package enums;

public enum Locations {
    UNDER_THE_TABLE {
        @Override
        public String toString(){
            return "under the table";
        }
    },
    MIDDLE_OF_THE_ROOM {
        @Override
        public String toString(){
            return "where the kid is";
        }
    },
    BY_THE_WINDOW{
        @Override
        public String toString(){
            return "the window";
        }
    },
    OUT_THE_WINDOW{
        @Override
        public String toString(){
            return "out the window";
        }
    }
}
