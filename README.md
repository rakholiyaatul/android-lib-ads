[![](https://jitpack.io/v/rakholiyaatul/android-lib-ads.svg)](https://jitpack.io/#rakholiyaatul/android-lib-ads)

# lib-ads
this library to show AdMob app open ads with simple and custom way 

# usage
# Dependency
Include the library in your build.gradle

	repositories {
	    mavenCentral()
	    maven { url 'https://jitpack.io' }
	}

	
	dependencies {
	      implementation 'com.github.rakholiyaatul:lib-ads:1.0.0'
	}

first set app open ad id:


 	AdUtils.setID(this, "your-ad-id");
  

# Make custom

If you want to show app onen ads only when starting of your app:

	  AdUtils.setSingle(this, true);
   
                // if you want to show ad every time when user come in app form outside, set the value false
  

To start using the library you just need to call AppOpenAdManager with a valid Context and call intent for next activity:

	new Handler().postDelayed(() -> {
            AdUtils.isOpen = true;
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            new AppOpenAdManager(SplashActivity.this, intent);
        }, 500);
	



