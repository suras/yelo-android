/*
 *
 *  * Copyright (C) 2015 yelo.red
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 *
 */package red.yelo.bus;

import android.widget.EditText;

/**
 * Created by anshul1235 on 19/07/14.
 */
public class BroadCastSent {

    public boolean closePanel;
    public EditText editText;

    public BroadCastSent(boolean closePanel,EditText editText)
    {
        this.closePanel=closePanel;
        this.editText=editText;
    }

}
