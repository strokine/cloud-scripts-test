import com.comcast.xbo.wpil.ScriptCloudFunction
import com.comcast.xbo.wpil.device.Device

class Test1Script : ScriptCloudFunction<Device, Device>{

    override fun apply(t: Device): Device {
        println("IN THE SCRIPT $t")
        t.name = t.name!!.toUpperCase()
        return t
    }
}

Test1Script()
