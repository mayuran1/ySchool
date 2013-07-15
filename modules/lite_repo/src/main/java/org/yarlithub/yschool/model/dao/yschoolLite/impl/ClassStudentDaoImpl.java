package org.yarlithub.yschool.model.dao.yschoolLite.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassStudent;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.model.dao.yschoolLite.ClassStudentDao;
import org.yarlithub.yschool.model.obj.yschoolLite.ClassStudentPK;
 
/**
 * DAO for table: ClassStudent.
 * @author autogenerated
 */
@Repository
public class ClassStudentDaoImpl extends GenericHibernateDaoImpl<ClassStudent, ClassStudentPK> implements ClassStudentDao {
	
	/** Constructor method. */
		public ClassStudentDaoImpl() {
			super(ClassStudent.class);
		}
	}
