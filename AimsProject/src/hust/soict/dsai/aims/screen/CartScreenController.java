package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.transformation.FilteredList;

public class CartScreenController {
	private Cart cart;
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
	
	@FXML
	private TableView<Media> tblMedia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediaCategory;
	
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	
    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private RadioButton radioBtnFilterId;

    @FXML
    private RadioButton radioBtnFilterTitle;
    
    @FXML
    private TextField tfFilter;
	
	public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
	
	@FXML
	private void initialize() {
		colMediaTitle.setCellValueFactory(
				new PropertyValueFactory<Media, String>("title"));
		colMediaCategory.setCellValueFactory(
				new PropertyValueFactory<Media, String>("category"));
		colMediaCost.setCellValueFactory(
				new PropertyValueFactory<Media, Float>("cost"));
		tblMedia.setItems(this.cart.getItemsOrdered());
		
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		
		tblMedia.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<Media>() {
					@Override
					public void changed(ObservableValue<? extends Media> observable, Media oldValue,
							Media newValue) {
						if (newValue != null) {
							updateButtonBar(newValue);
						}
					}
					
					private void updateButtonBar(Media media) {
						btnRemove.setVisible(true);
						if (media instanceof Playable) {
							btnPlay.setVisible(true);
						}
						else {
							btnPlay.setVisible(false);
						}
					}
				});
		tfFilter.textProperty().addListener(new ChangeListener<String>() {
		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue,
				String newValue) {
			showFilteredMedia(newValue);
		}
		
		private void showFilteredMedia(String keyword) {
			FilteredList<Media> filteredList = new FilteredList<>(cart.getItemsOrdered());
			
			if (!keyword.isEmpty() && radioBtnFilterId.isSelected()) {
				filteredList.setPredicate(media -> {
					String idString = String.valueOf(media.getId());
					return idString.equals(keyword);
					});					
				} else if (!keyword.isEmpty() && radioBtnFilterTitle.isSelected()) {
					filteredList.setPredicate(media -> {
						String title = media.getTitle().toLowerCase();
						return title.contains(keyword.toLowerCase());
					});
				} else {
				filteredList.setPredicate(null);
			}
			tblMedia.setItems(filteredList);
		}
		
		});
	}
	
	
	
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }
    
	
	
}
