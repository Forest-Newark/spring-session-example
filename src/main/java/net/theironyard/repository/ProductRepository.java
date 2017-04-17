package net.theironyard.repository;

import net.theironyard.bean.Product;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public List<Product> listProducts(){
        return Arrays.asList(
                new Product(
                        1,
                        "Right-Angle Speed Reducer",
                        "https://www.mcmaster.com/mvA/Contents/gfx/ImageCache/588/5887k181l1-d03bs_635421748860000000.png?ver=ImageNotFound",
                        "Shaft Input, 5:1 Ratio, 1.33\" Center",
                        "Transmit motion at a 90° angle while reducing speed and increasing torque. Speed reducers accept clockwise or counterclockwise input rotation. They require a coupling (not included) to connect to your motor.\nOptional mounting bases allow you to mount speed reducers to machinery. They come with four bolts.",
                        new BigDecimal("403.57")
                ),

                new Product(
                        2,
                        "Pistol-Grip Soldering Iron",
                        "https://images1.mcmaster.com/mvA/contents/gfx/large/7727a2p1-b03l.png?ver=1393489698",
                        "with Built-in Conical Tip, 150/400 Watts",
                        "Pull the trigger for instant heat; release it and the gun quickly cools. The tip is built into the heating element.\n",
                        new BigDecimal("403.57")
                ),

                new Product(
                        3,
                        "Air-Powered Framing/Finishing Nailer",
                        "https://images1.mcmaster.com/mvA/contents/gfx/large/6078a35p1-b02l.png?ver=1339586896",
                        "Sets 1-3/4\" to 6\"",
                        "(1-4) Air Powered—All have a 1/4\" NPT female connection and a metal housing. Style 3 fits in the palm of your hand and can be used in any position. Operating pressure is 60-100 psi. See Nail Group AA to find compatible nails for 96384A210, Nail Group A to find compatible nails for 5906A46, Nail Group C to find compatible nails for 36275A65, and Nail Group G to find compatible nails for 6101A62.",
                        new BigDecimal("57.86")
                ),

                new Product(
                        4,
                        "Black-Oxide Steel Hoist Ring for Lifting",
                        "https://www.mcmaster.com/mvA/Contents/gfx/ImageCache/307/3070t51p1-e01gl_635162365530000000.png?ver=ImageNotFound",
                        "1/2\"-13 Thread Size",
                        "Designed for angular lifting, hoist rings resist stresses that would bend or break an eyebolt. They have a lifting ring that pivots 180° front to back and a base that swivels 360° to compensate for pitch, roll, and sway when lifting heavy or unbalanced loads. Install the base of the hoist ring flush to the mounting surface and tighten to the recommended torque that is stamped on the ring. Torque Wrenches are sold separately.\nBlack-oxide steel offers mild corrosion resistance.\nNote: Capacities listed are for vertical lifting only. As the lift angle changes from vertical, the amount of weight the hoist ring can lift is significantly reduced. For example, when lifting a 1,000 lb. load at a 45° angle, you must choose a hoist ring with a capacity of at least 1,400 lbs. Do not use at an angle less than 30°.\nWarning: Never use to lift people or items over people.",
                        new BigDecimal("115.42")
                )
        );
    }
}
