/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ceying.flowable.modeler.app.modeler.model.editor.form;

import com.ceying.flowable.modeler.app.modeler.domain.editor.AbstractModel;
import com.ceying.flowable.modeler.app.modeler.model.common.AbstractRepresentation;
import org.flowable.form.model.FormModel;

import java.util.Date;

public class FormRepresentation extends AbstractRepresentation {

    protected String id;
    protected String name;
    protected String key;
    protected String description;
    protected Integer version;
    protected String lastUpdatedBy;
    protected Date lastUpdated;
    protected FormModel formDefinition;

    public FormRepresentation(AbstractModel model) {
        this.id = model.getId();
        this.name = model.getName();
        this.key = model.getKey();
        this.description = model.getDescription();
        this.version = model.getVersion();
        this.lastUpdated = model.getLastUpdated();
        this.lastUpdatedBy = model.getLastUpdatedBy();
    }

    public FormRepresentation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public FormModel getFormDefinition() {
        return formDefinition;
    }

    public void setFormDefinition(FormModel formDefinition) {
        this.formDefinition = formDefinition;
    }
}
