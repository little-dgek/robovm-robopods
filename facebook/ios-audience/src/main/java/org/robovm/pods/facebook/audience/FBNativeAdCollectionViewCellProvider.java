/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package org.robovm.pods.facebook.audience;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdCollectionViewCellProvider/*</name>*/ 
    extends /*<extends>*/FBNativeAdCollectionViewAdProvider/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdCollectionViewCellProviderPtr extends Ptr<FBNativeAdCollectionViewCellProvider, FBNativeAdCollectionViewCellProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdCollectionViewCellProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdCollectionViewCellProvider() {}
    protected FBNativeAdCollectionViewCellProvider(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdCollectionViewCellProvider(SkipInit skipInit) { super(skipInit); }
    public FBNativeAdCollectionViewCellProvider(FBNativeAdsManager manager, FBNativeAdViewType type) { super((SkipInit) null); initObject(init(manager, type)); }
    public FBNativeAdCollectionViewCellProvider(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes) { super((SkipInit) null); initObject(init(manager, type, attributes)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithManager:forType:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type);
    @Method(selector = "initWithManager:forType:forAttributes:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes);
    @Method(selector = "collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell getCellForItem(UICollectionView collectionView, NSIndexPath indexPath);
    @Method(selector = "collectionView:heightForRowAtIndexPath:")
    public native @MachineSizedFloat double getHeightForRow(UICollectionView collectionView, NSIndexPath indexPath);
    /*</methods>*/
}
