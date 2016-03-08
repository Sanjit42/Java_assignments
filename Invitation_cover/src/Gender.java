/**
 * Created by sanjitd on 07/03/16.
 */
public enum Gender {
        MALE {
            public String toString(){
                return "Mr";
            }
    },
    FEMALE {
        public String toString(){
            return "Ms";
        }
    }
}
