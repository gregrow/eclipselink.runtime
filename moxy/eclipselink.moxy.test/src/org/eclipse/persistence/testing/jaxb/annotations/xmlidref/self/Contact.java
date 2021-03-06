/*******************************************************************************
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Blaise Doughan - 2.4.3 - initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.jaxb.annotations.xmlidref.self;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;

public class Contact {

    @XmlIDREF
    public PhoneNumber idRefPhoneNumber;
    
    @XmlElementWrapper
    @XmlElement(name="idRefPhoneNumber")
    @XmlIDREF
    public List<PhoneNumber> idRefPhoneNumbers = new ArrayList<PhoneNumber>();

    @Override
    public boolean equals(Object obj) {
        if(null == obj || obj.getClass() != this.getClass()) {
            return false;
        }
        Contact test = (Contact) obj;

        if(!equals(idRefPhoneNumbers, test.idRefPhoneNumbers)) {
            return false;
        }

        if(null == idRefPhoneNumber) {
            return null == test.idRefPhoneNumber;
        } else {
            return idRefPhoneNumber.equals(test.idRefPhoneNumber);
        }
    }

    private boolean equals(List<PhoneNumber> control, List<PhoneNumber> test) {
        if(control == test) {
            return true;
        }
        if(null == control || null == test) {
            return false;
        }
        if(control.size() != test.size()) {
            return false;
        }
        for(int x=0; x<control.size(); x++) {
            if(!control.get(x).equals(test.get(x))) {
                return false;
            }
        }
        return true;
    }

}
