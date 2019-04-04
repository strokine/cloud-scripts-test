import com.comcast.xbo.wpil.CloudFunction
import com.comcast.xbo.wpil.device.Device

class Test3Script : CloudFunction<Device, Device>(){

    override fun apply(t: Device): Device {
        println("Hello there SCRIPT $t")
        t.name = t.name!!.toUpperCase()
        return t
    }
}

Test3Script()
