package tk.aizydorczyk.gradebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.aizydorczyk.gradebook.utility.AlertUtil;
import tk.aizydorczyk.gradebook.utility.SystemContext;

@Service
public abstract class BaseService {

	@Autowired
	protected AlertUtil alertUtil;

	@Autowired
	protected SystemContext systemContext;

}
