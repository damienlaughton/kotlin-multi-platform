//
//  WeatherViewController.swift
//  WorkshopProject
//

import UIKit
import SharedLib

class WeatherViewController: UIViewController, WeatherContractView {
    private let injection = Injection()
    private var presenter: WeatherPresenter!

    @IBOutlet weak var label: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        print(MyClass().getMyPlatformName())

        self.presenter = injection.weatherPresenter()
        presenter.takeView(view: self)
    }
    
    deinit {
        presenter.dropView()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    func showWeather(weather: Weather) {
        print("My weather! \(weather)")
        
        label.text = weather.temp.description
    }
}

