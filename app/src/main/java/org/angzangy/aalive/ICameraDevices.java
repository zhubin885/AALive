package org.angzangy.aalive;

import android.graphics.SurfaceTexture;

/**
 * Created on 2017/1/24.
 */

public interface ICameraDevices {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    public void openCamera(SurfaceTexture surfaceTexture, int cameraId);
    public void setCameraParameters();
    public void startCameraPreview();
    public void stopCameraPreview();
    public void releaseCamera();
    public void setOnCameraPreviewSizeChangeListener(OnCameraPreviewSizeChangeListener listener);
}
