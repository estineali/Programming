import json
import webbrowser


TABS_FILENAME = "list.txt"
CONFIG_FILENAME = "config.json"
TABS_KEY = "tabs"

def json_reopener():
    
    json_file = open(CONFIG_FILENAME)
    config = json.load(json_file)
    
    for address in config[TABS_KEY]:
        webbrowser.open(address)

    json_file.close()


def text_reopener():
    txt_file = open(TABS_FILENAME)
    for i in txt_file:
        webbrowser.open(i.strip())
    txt_file.close()    


text_reopener()
