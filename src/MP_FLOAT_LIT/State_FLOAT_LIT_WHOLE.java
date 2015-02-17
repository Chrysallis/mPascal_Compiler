//Created by Hunter Lapp
package MP_FLOAT_LIT;

import regex.State;
import MP_FLOAT_LIT.State_FLOAT_LIT_DECIMAL;

public class State_FLOAT_LIT_WHOLE extends State {
    private static State state;
    private State_FLOAT_LIT_WHOLE() {
        state = this;                   // added by Christina
    }
    // states are singletons
    public static State getState() {
        if(state==null) {
            return new State_FLOAT_LIT_WHOLE();
        }
        else return state;
    }

        @Override
        public void read(char c) {
            if(Character.isDigit(c)) {
                context.changeState(State_FLOAT_LIT_WHOLE.getState());
            }
             else {
            	 if (c =='.')
            	 {
            		 context.changeState(State_FLOAT_LIT_DECIMAL.getState());
            	 }
            	 if (c == 'e' || c == 'E')
            	 {
            		 context.changeState(State_FLOAT_LIT_e.getState());
            	 }
                else {
                     context.changeState(regex.InvalidState.getState());
                 }
	        }
        }

	        @Override
	        public boolean accepted() {
	            return false;
	        }
}

