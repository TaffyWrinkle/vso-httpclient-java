// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public class ApprovalOptions {

    private boolean releaseCreatorCanBeApprover;
    private int requiredApproverCount;

    public boolean getReleaseCreatorCanBeApprover() {
        return releaseCreatorCanBeApprover;
    }

    public void setReleaseCreatorCanBeApprover(final boolean releaseCreatorCanBeApprover) {
        this.releaseCreatorCanBeApprover = releaseCreatorCanBeApprover;
    }

    public int getRequiredApproverCount() {
        return requiredApproverCount;
    }

    public void setRequiredApproverCount(final int requiredApproverCount) {
        this.requiredApproverCount = requiredApproverCount;
    }
}
