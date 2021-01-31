public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucketCount = 0;
        double area = width * height;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            bucketCount = (int)Math.ceil((area / areaPerBucket) - extraBuckets);
        }
        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        int bucketCount = 0;
        double area = width * height;
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketCount = (int)Math.ceil((area / areaPerBucket));
        }
        return bucketCount;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketCount = 0;
        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketCount = (int)Math.ceil((area / areaPerBucket));
        }
        return bucketCount;
    }
}
