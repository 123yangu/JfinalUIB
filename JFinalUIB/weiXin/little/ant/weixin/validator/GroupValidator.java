package little.ant.weixin.validator;

import little.ant.weixin.model.Group;

import org.apache.log4j.Logger;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

public class GroupValidator extends Validator {

	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(GroupValidator.class);
	
	protected void validate(Controller controller) {
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/wx/group")){
			
		}
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(Group.class);
		
		String actionKey = getActionKey();
		if (actionKey.equals("/jf/wx/group")){
			
		}
	}
}
