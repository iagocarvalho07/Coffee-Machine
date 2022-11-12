class OperatingSystem(var name: String = "name")

class DualBoot(
    var primaryOs: OperatingSystem = OperatingSystem("ia"),
    var secondaryOs: OperatingSystem = OperatingSystem("go")
)
